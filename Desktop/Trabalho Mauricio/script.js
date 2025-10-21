function BuscarCep() {
    var cep = document.getElementById("cep").value;
    var url = "https://viacep.com.br/ws/" + cep + "/json/";
    fetch(url) /*fetch buscar os dados na url no caso no viacep*/
        .then(response => response.json())
        .then(data => {
            if (data.erro) {
                alert("CEP não encontrado");
            } else {
                document.getElementsByName("rua")[0].value = data.logradouro;
                document.getElementsByName("bairro")[0].value = data.bairro;
                document.getElementsByName("cidade")[0].value = data.localidade;
                document.getElementsByName("estado")[0].value = data.uf;
            }
        })
        .catch(error => {
            console.error("Erro ao consultar o CEP:", error);
            /* caso a net tiver ruim ou o ViaCep tiver fora do ar da esse erro */
        });
}
/*/*("rua")[0].value = data.logradouro; 
("rua") = faz uma lista
[0] = pega o primeiro item da lista
.value = data.logradouro; = retorna o valor que veio do viaCep*/