const requestBody = {
  "headers": {
    "Authorization": "Basic dXNlcjpjMzY5MGZhOC0wZjc1LTRiNjQtYTE2ZC1hZDI0N2UwMGI1YTI="
  }
};

const notLoad = false;

fetch("http://127.0.0.1:8080/api/pizzas/available", requestBody)
  .then(response =>  {
    if (response.status != 200) {
      notLoad = true;
    }
    return response.text()
  })
  .then(result => {
    if (notLoad) {
      console.log(result)
    } else {
      const bodyTag = document.body;
      
      const divContent = document.createElement("div");
      console.log(result);
      divContent.append(result);
      bodyTag.appendChild(divContent);
    }
  })
  .catch(e => {
    console.log(`Error: ${e}`);
  })
