const requestBody = {
  "headers": {
    "Authorization": "Basic dXNlcjo4MjI0NWE3Zi0yYjIxLTQ0NDAtYjM3My00MDQwNzY5NTU4M2I="
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
