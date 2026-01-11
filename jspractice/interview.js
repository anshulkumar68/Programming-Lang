function findDuplicate(){
    let arr = [3, 5, 2, 6, 2, 3, 8, 3]
    let res = [], seen = {}, added = {}
    for(let num  of arr){
        if(seen[num] & !added[num]){
            res.push(num);
            added[num]=true;
        } 
        else seen[num] = true;
    }
    console.log(res)
}
findDuplicate()