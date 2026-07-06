function mostrarMensagem() {

    // Mostra a mensagem na tela
    document.getElementById("mensagem").style.display = "block";

    // Pega o elemento de áudio
    const musica = document.getElementById("musica");

    // Tenta tocar a música
    musica.play().catch(() => {
        alert("Não foi possível tocar a música. Verifique se o arquivo existe.");
    });

}
