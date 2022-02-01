function alphanumeric(string){
    const isSymbol = /[\W_]/g.test(string);
    const isWhitespace = /\s/g.test(string);
  
    //console.log(`WhiteSpace: ${isWhitespace} || isSymbol: ${isSymbol}`);

    if(isWhitespace == false && isSymbol == false && string.length != 0) {
        return true;
    } else {
        return false;
    }

  }
