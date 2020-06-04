class TextFrequency():
    
    def __init__(self, file_name):
        self.text = ""
        self.file_name = file_name       
        self.getText()
    def getText(self):
        file = open(self.file_name)
        text = file.read()
        self.text = text
        self.text = self.text.replace('\n', ' ') 
        return self.text
        file.close()
    def letterFreq(self):
        self.freqText = self.text
        self.freq = {}
                     
        for letter in self.freqText:         
            for l in letter:
                if l in self.freq:                  
                    self.freq[l] = self.freq[l] + 1
                else:
                    self.freq[l] = 1
            
        return self.freq
    
    def wordFreq(self):
        self.freqText = self.text
        self.freq = {}
        for word in self.freqText.split():
            words = word.split()
            for w in words:
                if w in self.freq:
                    self.freq[w] = self.freq[w] + 1
                else:
                    self.freq[w] = 1

        lowerLyrics = self.freqText.lower()

        for word in lowerLyrics.split():
            words = word.split()
            for w in words:    
                if w in self.freq:
                    pass
            
        return self.freq
    def toLower(self):
        
        self.text = self.text.lower()



class HistogramPrinter(TextFrequency):
    def __init__(self, file_name):
        TextFrequency.__init__(self, file_name)

    def printLetterHist(self):
        self.freq = {}
        self.freq = self.letterFreq()
        self.outText =""

        for letter in self.freq:
            
            i=0
            self.outText = letter
            while i < self.freq[letter]:
                self.outText += "*"
               
                i= i +1
            print(self.outText)
        
    def printWordHist(self):
        self.freq = {}
        self.freq = self.wordFreq()
        self.outText =""
        for word in self.freq:
            
            i=0
            self.outText = word
            while i < self.freq[word]:
                self.outText += "*"
               
                i= i +1
            print(self.outText)
        

myText = TextFrequency("/Users/Edturner/Documents/python/lyrics.txt")

letterFreq = myText.letterFreq()

#for letter in letterFreq:
 #   print(letter, letterFreq[letter])

#wordFreq = myText.wordFreq()
#for word in wordFreq:
#    print(word, wordFreq[word])

myHist = HistogramPrinter("/Users/Edturner/Documents/python/lyrics.txt")


myHist.toLower()
myHist.printLetterHist()
#myHist.printWordHist()