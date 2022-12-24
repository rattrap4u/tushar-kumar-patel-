const num = 4;
if(num == 1 || num ==0){
    console.log(" The number is not a prime number which is  : "+num);
}

const isPrime = (num) => {
   let sqrtnum = Math.floor(Math.sqrt(num));
   let prime = num !== 1;
   for(let i = 2; i < sqrtnum + 1; i++){
      if(num % i === 0){
         prime = false;
         break;
      };
   };
   return prime;
}
const nextPrime = (num = 1) => {
   while(!isPrime(++num)){
   };
   return num;
};
console.log("Next prime number is "+nextPrime(num));
function difference() {
    
    var diff = (nextPrime(num) - num)
    console.log(" The difference between two consecutive prime number is : "+diff);
}
difference();