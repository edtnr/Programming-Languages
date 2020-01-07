/**output = "";
for (i=0; i<20; i++) {
    output += i + " ";
    
    if (i%2==0){
        output += "Fizz";

    } 
    if (i%3==0) {
        output +="Buzz";
    }
    console.log(output);
    output = "";
}**/

/**i =0;
while (i < 10) {
    i++;
    j = Math.random();
    if (j>0.5) {
        console.log("Heads");
    }else if (j < 0.5) {
        console.log("Tails");
    }
} **/
/**Animals = ['Cat', 'Dog', 'Cow', 'Rabbit'];

for (i in Animals) {
    console.log(Animals[i].toUpperCase());
}**/

function isPrime(num) {
    if(num < 2) return false;
    for (var i = 2; i < num; i++) {
        if(num%i==0)
            return false;
    }
    return true;
}

function printPrimes(n) {   
    for(let i = 0; i < n; i++){
        if(isPrime(i)) console.log(i);
    }
}
printPrimes(10);