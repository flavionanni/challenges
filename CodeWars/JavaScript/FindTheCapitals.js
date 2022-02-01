var capitals = function (word) {
    let index = [];
    let contIndex = 0
    for(let char of word) {
        if(char == char.toUpperCase()) {
            index.push(contIndex);
        }
        contIndex++;
    }
    return index;
};
