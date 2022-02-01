function squareDigits(num){
let numberToString = String(num);
let result = ""
for(let number of numberToString.split("")){

  result += Math.pow(number,2);
  
}
return Number(result);
}
