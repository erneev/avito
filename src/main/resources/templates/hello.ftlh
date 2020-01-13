<#import "main.ftlh" as main>
<@main.main>
    <h1>Hello World!</h1>
    <#list posts as post>
        <h1>${post.title}</h1>
    </#list>
</@main.main>