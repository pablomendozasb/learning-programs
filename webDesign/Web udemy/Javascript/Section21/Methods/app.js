const myMath = {
    PI: 3.1416,
    square: function (num) {
        return num*num;
    },
    cube: function(num) {
        return num**3;
    }
}

const cat = {
    name: 'Blue Steele',
    color: 'Grey',
    breed: 'Scottish Fold',
    meow(){
        console.log("THIS IS:", this);
        console.log(`${this.name} says MEOWWW`);
    }
}

const meow2 = cat.meow;

const hen = {
    
    name: 'Helen',
    eggCount:0,
    layAnEgg() {
        this.eggCount = this.eggCount + 1; 
        return "EGG";
    }
}

// hen.name;
// hen.eggCount;
// hen.layAnEgg();
// hen.layAnEgg();
// hen.eggCount;