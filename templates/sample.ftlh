<html>
<head>
  <title>${title}</title>
</head>
<body>
  <h1>Welcome ${user}!</h1>
  <p>Our Latest product :</p>
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
  <#assign x=4>
  <p>Loop to print String ${x} times:
  <#assign count=0>
  <#list repeat("Sahil",x) as li>
  ${(count)+1}. ${li}
  </#list>
  ${repeat1("Sahil",10)}
  </p>  
</body>
</html>