function spinWords(str) {
    let phrase = str.split(" ")
    let count = 0;
    for (let oneStr of phrase) {
        if (oneStr.length >= 5) {
            phrase[count] = oneStr.split("").reverse().join("");
        }
        count++
    }
    return phrase.join(" ");
}
