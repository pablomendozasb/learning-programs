function capitalize (letter) {
    
    const myArray = letter.split("");
    console.log(myArray);
    let upperCaseLetter = myArray[0].toUpperCase();
    console.log(upperCaseLetter);

    for (i = 0; i < myArray.length -1; i++) {
        upperCaseLetter += letter[i+1]
    }
    
    console.log(upperCaseLetter);
}

capitalize ("brains");