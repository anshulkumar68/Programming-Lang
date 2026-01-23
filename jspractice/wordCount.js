// str = 'Hi Hello, how are you, how are you doing!'
function wordCount(){
    let str = 'Hi HellO how are you how are you doing'.toLowerCase();
    let res = '';
    let count = {}
    let words = str.split(' ')
    //removing 'o'
    for(let i=0; i<str.length; i++){
        if(str[i]!=='o'){
            res += str[i] ;
        }
    }
    //counting words
    for(let word of words){
        if(count[word]) count[word] += 1;
        else count[word] = 1
    }
    console.log(res)
    console.log(count)
}
wordCount()

