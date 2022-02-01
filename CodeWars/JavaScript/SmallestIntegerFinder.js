class SmallestIntegerFinder {
    findSmallestInt(args) {
    
        return (Math.min(...args));

    }  
}
  
let test = new SmallestIntegerFinder();

console.log(test.findSmallestInt([710,20,45,546,0]));
