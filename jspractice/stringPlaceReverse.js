// str = 'Anshul Kumar from Uttar Pradesh'
// rattU Anshul from Pradesh ramuK

function stringPlaceReverse() {
    let str = 'Anshul Kumar from Uttar Pradesh';
    let words = str.split(' ');
    let startWord = '';
    let endWord = '';
    let middleWords = [];
        res = '',
        reversed = [];

    for (let word of words) {
        if (word === 'Uttar') {
            startWord = word.split('').reverse().join('');
        } else if (word === 'Uttar') {
            endWord = word.split('').reverse().join('');
        } else {
            middleWords.push(word);
        }
    }
    res = [startWord, ...middleWords, endWord].join(' ')
    console.log(res)
}
stringPlaceReverse();
