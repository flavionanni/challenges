function findUniq(arr) {
    arr.sort();
    return (arr[0] == arr[1]) ? arr.pop() : arr.shift();
    
  }
