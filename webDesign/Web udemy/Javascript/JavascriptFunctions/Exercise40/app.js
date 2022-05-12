

function arrayArguments (number) {

    let last = 0;

    if (number[0] !== undefined) {
        for (i = 0; i < number.length; i++) {
last++;
        }

        return number[last-1];
    }

    else 
        return null;
  
}

