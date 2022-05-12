const person = {
    firstName : 'Viggo',
    lastName : 'Mortensen',
    fullName : () => {
        return `${this.firstName} ${this.lastName}`
    } ,
    shoutName : function () {
        setTimeout(function(){
            console.log(this.fullName())
        },3000)
    }
}