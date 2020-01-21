import Data.Char
import Data.List
import Data.Function
import Data.Maybe

removePunctuation :: String -> String
removePunctuation str = [ x | x <- str, not (x `elem` ",.?!-:;\"\')'")]

toWordList :: String -> [String]
toWordList str = words (removePunctuation (map toLower str))

searchCommonWords :: [String] -> [String]
searchCommonWords str = filter (\x -> x `elem` ["the", "a", "it", "he", "be", "in", "for", "as", "to", "that", "not", "you", "of", "have", "on", "do", "and", "I", "with", "at"]) str

countWords :: [String] -> [(String, Int)]
countWords str = map (\x -> (head x, length x)) $ group $ sort str

countCommonWords :: [String] -> Int
countCommonWords str = sum (map(\x -> (length x)) $ group $ sort (searchCommonWords (str)))

--function to remove common words using filter
dropCommonWords :: [String] -> [String]
dropCommonWords str = filter (\x -> x `notElem` ["the", "a", "it", "he", "be", "in", "for", "as", "to", "that", "not", "you", "of", "have", "on", "do", "and", "I", "with", "at"]) str

--using replicate generate a number of asterisks depending on the occurences
getAsterisk x = "\n" ++ (replicate (snd x) '*') ++ "->" ++ (fst x)
makeHistogram str = concat $ map getAsterisk str

--sort in descending order of the second attribute in the list (number of occurence)
sortWords str = (reverse.sortBy (compare `on` snd)) str

text = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way--in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only.\nThere were a king with a large jaw and a queen with a plain face, on the throne of England; there were a king with a large jaw and a queen with a fair face, on the throne of France. In both countries it was clearer than crystal to the lords of the State preserves of loaves and fishes, that things in general were settled for ever."

main = do
    let wordlist = toWordList text
    let wordlist = toWordList text
    putStrLn "Report:"
    putStrLn ("\t" ++ (show $ length wordlist) ++ " words")
    putStrLn ("\t" ++ (show $ countCommonWords wordlist) ++ " common words")
    putStrLn "\nHistogram of the most frequent words (excluding common words):\n"
    putStr $ makeHistogram $ sortWords $ countWords $ dropCommonWords $ wordlist

    