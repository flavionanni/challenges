function getMiddle(s)
{
  if(Number(s.length) % 2 == 0){
    return (s[(s.length/2)-1] + s[s.length/2])
  }
    return (s[Math.round((s.length/2)-1)]);
}
