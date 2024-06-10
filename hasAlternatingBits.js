/**
 * @param {number} n
 * @return {boolean}
 */
var hasAlternatingBits = function(n) {
  let lastBit = -1
  let result = true;
  
  while(n > 0) {
      const bit = n & 1;

      if(bit == lastBit) {
          result = false;
          break;
      }
      lastBit = bit
      n = n >>> 1;

  }
  return result;
};