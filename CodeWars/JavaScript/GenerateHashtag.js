function generateHashtag(str) {

    let length = str.replace(/\s+/g, '').length;
    let newArray = [];
    let count = 0;

    for (letter of str.split(" ")) {
        newArray[count] = letter.charAt(0).toUpperCase() + letter.slice(1,)
        count++;
    }

    if (length > 0 && length < 140) {
        return '#' + newArray.join("");
    } else {
        return false;
    }

}
