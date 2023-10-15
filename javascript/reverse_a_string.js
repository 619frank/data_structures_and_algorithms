function stringReverse(string){
    let reversed = '';
    for( let i = string.length; i >=0; i--){
        reversed += string[i];
    }
   console.log(reversed); 
}


stringReverse("Frank");
