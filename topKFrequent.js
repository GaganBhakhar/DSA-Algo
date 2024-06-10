/**
 * @param {string[]} words
 * @param {number} k
 * @return {string[]}
 */
var topKFrequent = function(words, k) {
  let frequency = {}

  words.forEach((word)=> {
      if(frequency[word]) {
          frequency[word] += 1;
      } else {
          frequency[word] = 1;
      }
  })

  const array = Object.keys(frequency).sort().sort((a,b)=> frequency[b] - frequency[a]);
  return array.slice(0, k)
};