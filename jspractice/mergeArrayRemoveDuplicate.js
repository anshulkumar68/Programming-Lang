// Merge two arrays and remove duplicates
function mergeArrayRemoveDuplicate(){
    let arr1 = [3, 6, 2, 5, 9 , 12];
    let arr2 = [43, 1, 5, 23];
    let res = [];
    let seen = {};

    let merged = arr1.concat(arr2);
    for(let value of merged){
        if(!seen[value]){
            seen[value] = true;
            res.push(value)
        }
    }
    console.log(res)
}
mergeArrayRemoveDuplicate()