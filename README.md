# 📸 Visualizador de Imagens

Um aplicativo Android moderno para visualizar e gerenciar imagens de forma dinâmica, permitindo trocar entre diferentes fotos através de botões interativos.

---

## 🎯 Objetivo do Aplicativo

Desenvolver uma aplicação Android que demonstra o uso de componentes visuais essenciais como `ImageView`, `Button` e `TextView`, com manipulação de eventos de clique para alterar imagens e textos dinamicamente.

---

## ✨ Funcionalidades Principais

- ✅ **Exibição de Imagens** - Visualização dinâmica de imagens em alta qualidade
- ✅ **Troca de Imagens** - Alternância entre diferentes fotos através de botões
- ✅ **Texto Informativo** - Exibição de informações sobre a imagem atual
- ✅ **Layout Responsivo** - Adaptação automática para diferentes tamanhos de tela
- ✅ **Interface Moderna** - Design limpo com ConstraintLayout

---

## 🏗️ Estrutura da Interface

### Componentes Principais

| Componente | Descrição | Função |
|-----------|-----------|--------|
| **ImageView** | Área de exibição de imagens | Mostra a imagem selecionada (250x250dp) |
| **TextView (Título)** | Título principal | Exibe "VISUALIZADOR DE IMAGENS" |
| **TextView (Informação)** | Texto informativo | Mostra o nome da foto atual |
| **Button (Foto 1)** | Botão de ação | Carrega e exibe a primeira imagem |
| **Button (Foto 2)** | Botão de ação | Carrega e exibe a segunda imagem |

### Layout Visual

```
┌─────────────────────────────────┐
│   VISUALIZADOR DE IMAGENS       │
├─────────────────────────────────┤
│                                 │
│          [IMAGEM 250x250]       │
│                                 │
├─────────────────────────────────┤
│           Foto 1                │
├──────────────────┬──────────────┤
│  Abrir Foto 1    │  Abrir Foto 2│
└──────────────────┴──────────────┘
```

---

## 🚀 Como Funciona

### 1. Exibição Inicial
O aplicativo carrega a **Foto 1** como imagem padrão na inicialização.

### 2. Mudança de Imagens
Ao clicar em qualquer botão:
- A imagem é alterada dinamicamente via `setImageResource()`
- O texto informativo é atualizado via `setText()`

### 3. Código de Funcionamento

```java
// Botão Foto 1
btfoto1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        imgfoto.setImageResource(R.drawable.foto1);
        txtinformacao.setText("Foto 1");
    }
});

// Botão Foto 2
btfoto2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        imgfoto.setImageResource(R.drawable.foto2);
        txtinformacao.setText("Foto 2");
    }
});
```

---

## 🛠️ Tecnologias e Ferramentas

Para o desenvolvimento deste projeto, foram utilizadas:

- **Linguagem:** [Java](https://www.java.com/pt-BR/)
- **Layout:** XML (ConstraintLayout e Material Design)
- **IDE:** [Android Studio](https://developer.android.com/studio)
- **Gerenciador de Dependências:** Gradle
- **API Mínima:** Android 5.0 (API 21)

---

## 📋 Requisitos do Projeto

### Arquivos de Imagem
O projeto requer duas imagens em formato JPEG:
- `foto1.jpg` - Primeira imagem a ser exibida
- `foto2.jpg` - Segunda imagem a ser exibida

**Localização:** `app/src/main/res/drawable/`

### Configurações Iniciais

| Configuração | Valor |
|-------------|-------|
| Application Name | Visualizador de Imagens |
| Company Domain | app.usuario |
| Activity Name | MainActivity |
| Layout Name | activity_main |
| Mininum SDK | API 21 (Android 5.0) |

---

## 📁 Estrutura do Projeto

```
SistemadeCadastro/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── br/ulbra/visualizadordeimagens/
│   │   │   │       └── MainActivity.java
│   │   │   └── res/
│   │   │       ├── layout/
│   │   │       │   └── activity_main.xml
│   │   │       └── drawable/
│   │   │           ├── foto1.jpg
│   │   │           └── foto2.jpg
│   └── build.gradle
└── README.md
```

---

## 💡 Conceitos Aprendidos

Durante o desenvolvimento desta aplicação, aprendemos:

1. **ConstraintLayout** - Layout responsivo e moderno
2. **ImageView** - Componente para exibição de imagens
3. **Button** - Criação de botões interativos
4. **TextView** - Manipulação de textos
5. **Eventos de Clique** - `setOnClickListener()`
6. **Manipulação Dinâmica** - Alteração de componentes em tempo de execução
7. **findViewById()** - Ligação de componentes XML ao Java
8. **setImageResource()** - Troca dinâmica de imagens
9. **setText()** - Atualização de textos

---

## 🎨 Vantagens do ConstraintLayout

✅ Interfaces mais modernas e responsivas  
✅ Melhor desempenho em comparação com layouts antigos  
✅ Layout responsivo para diferentes tamanhos de tela  
✅ Menor quantidade de código XML  
✅ Melhor adaptação para dispositivos variados  

---

## 🔧 Como Executar

1. **Abra o Android Studio Panda**
2. **Importe o projeto**
3. **Adicione as imagens** (`foto1.jpg` e `foto2.jpg`) em `res/drawable/`
4. **Compile o projeto** - Build > Rebuild Project
5. **Execute no emulador** - Run > Run 'app'
6. **Teste os botões** - Clique em "Abrir Foto 1" e "Abrir Foto 2"

---

## 📸 Resultado Final

O aplicativo apresentará:

✅ Título centralizado na parte superior  
✅ Uma imagem de 250x250dp no centro da tela  
✅ Texto informativo abaixo da imagem  
✅ Dois botões lado a lado para troca de imagens  
✅ Interface responsiva que se adapta a diferentes telas  

---

## 👨‍💻 Autor

Desenvolvido como atividade de aprendizado em Android com Java.

---

## 📝 Licença

Este projeto é fornecido como material educacional.

---

## 🤝 Contribuições

Sugestões e melhorias são bem-vindas!

Algumas ideias para expansão:
- 🖼️ Adicionar mais imagens
- 🎯 Implementar swipe para trocar imagens
- 💾 Salvar imagem favorita
- 📱 Zoom in/out nas imagens
- 🎨 Aplicar filtros
