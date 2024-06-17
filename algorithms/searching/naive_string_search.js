function naiveStringSearch(string,match){
    let count = 0
    for(let i = 0; i < string.length; i++){
        for(let j = 0; j < match.length; j++){
            if(string[i + j] !== match[j]){
            
                break
            }

            if(match.length - 1 == j)
            {
                count++
            }
        }
    }
    return count
}

console.log(naiveStringSearch('lorielolloled','lol'));
