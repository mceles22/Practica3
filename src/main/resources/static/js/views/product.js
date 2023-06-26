//CREATE AND UPDATE
$(document).on("click", ".open-modal", function () {
    const currentArbolId = Number($(this).attr('idarbol'));

    if (currentArbolId) {
        const currentArbol= arboles.find(x => x.id === currentArbolId);
        $("#id").val(currentArbol.id);
        $("#nombre_comun").val(currentArbol.nombre_comun);
        $("#edad_arbol").val(currentArbol.edad_arbol);
        $("#altura_arbol").val(currentArbol.altura_arbol);
        $("#tipo_arbol").val(currentArbol.tipo_arbol);
        $("#lugar_origen").val(currentArbol.lugar_origen);
        $("#ruta_imagen").val(currentArbol.ruta_imagen);
    }
});

$(document).on("click", "#saveArbol", function () {
    $("#formArbol").submit();
})

//Delete
$(document).on("click", ".btnDeleteArbol", function () {
    const currentArbolId = Number($(this).attr('idarbol'));
    const currentArbol = arboles.find(x => x.id === currentArbolId);
    $.ajax({
        url: 'arbol/delete',
        contentType: "application/json",
        dataType: 'json',
        type: 'POST',
        success: function (result) {
            location.reload();
        },
        //here we are serialization the object
        data: JSON.stringify(currentArbol)
    });
})