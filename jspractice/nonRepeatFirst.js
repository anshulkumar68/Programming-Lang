// Find first non-repeating character in a string
function nonRepeatFirst(){
    let str='Radhe Krishna'
    for(let i = 0; i<str.length; i++){
        let isUnique = true;
        for(let j =0; j<str.length; j++){
            if(i !==j && str[i]===str[j]){
                isUnique = false;
                break;
            }
        }
        if(isUnique && str[i]!==' ')
        console.log(str[i])
        return; 
    }
}
// nonRepeatFirst()    

// Find first non-repeating character in a string
function nonRepeatFirst2(){
    let str='Radhe Krishna'
    let count = {}
    for(let char of str){
        if(count[char]) count[char]+1;
        else count[char]=1;
    }
    for(let char of str){
        if(char !== ' ' && count[char] ===1){
            console.log(char)
            break;
        }   
    }
}
nonRepeatFirst2()    

