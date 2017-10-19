<#ftl encoding='UTF-8'>
<#import "/spring.ftl" as spring />
<@spring.bind "model"/>
<body xmlns="http://www.w3.org/1999/html">
<table>
    <tr>
        <th>ID</th>
        <th>Номер</th>
        <th>Марка</th>
    </tr>
<#list model.auto as auto>
    <tr>
        <td>${auto.id}</td>
        <td>${auto.number}</td>
        <td>${auto.model}</td>
    </tr>
</#list>
</table>
<form action="/auto" method="post" style="">
    <br>
    <span>Добавление автомобиля</span><br>
    <label>Номер</label>
    <input name="number"/><br><br>
    <label>Марка</label>
    <input name="model"/><br><br>
    <input type="submit" value="Добавить">
</form>
</body>