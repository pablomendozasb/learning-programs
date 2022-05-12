
function bankRobbery () {
    const heroes = ['Spiderman','Wolverine','Black Panther','Batwoman'];
    function cryForHelp(){
        for (let hero of heroes) {
            console.log(`Please help us, ${hero.toUpperCase}`);
        }
        
    }
    cryForHelp();
}