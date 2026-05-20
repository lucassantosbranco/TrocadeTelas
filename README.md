# 🔀 Troca de Telas

Um aplicativo Android que demonstra a navegação entre múltiplas telas utilizando Intent, permitindo transição fluida entre diferentes Activities com componentes visuais interativos.

---

## 🎯 Objetivo do Aplicativo

Desenvolver uma aplicação Android que demonstra como trabalhar com múltiplas telas em uma mesma aplicação, utilizando navegação entre Activities através de Intent e manipulação de eventos de clique.

---

## ✨ Funcionalidades Principais

- ✅ **Navegação entre Telas** - Transição fluida de uma tela para outra
- ✅ **Intent** - Comunicação entre Activities
- ✅ **Botões Interativos** - Eventos de clique para navegação
- ✅ **Múltiplas Activities** - Estrutura de projeto com várias telas
- ✅ **Layout Responsivo** - Design adaptável a diferentes dispositivos
- ✅ **Voltar para Tela Anterior** - Navegação de retorno com `finish()`

---

## 🏗️ Estrutura da Aplicação

### Telas Disponíveis

| Tela | Activity | Descrição |
|------|----------|-----------|
| **Tela Principal** | MainActivity | Tela inicial com botão para ir à segunda tela |
| **Segunda Tela** | Tela2Activity | Tela secundária com botão para voltar |

---

## 📊 Fluxo de Navegação

```
┌──────────────────────┐
│   TELA PRINCIPAL     │
│                      │
│  [Ir para Tela 2]    │
│         ↓            │
└──────────────────────┘
         |
         ↓
┌──────────────────────┐
│   SEGUNDA TELA       │
│                      │
│     [Voltar]  ←──────┘
│
└──────────────────────┘
```

---

## 🎨 Layout das Telas

### Tela Principal (MainActivity)

```
┌─────────────────────────────┐
│                             │
│                             │
│      Tela Principal         │
│                             │
│      [Ir para Tela 2]       │
│                             │
│                             │
└─────────────────────────────┘
```

**Componentes:**
- **TextView** - Título "Tela Principal"
- **Button** - Botão "Ir para Tela 2"

### Tela Secundária (Tela2Activity)

```
┌─────────────────────────────┐
│                             │
│                             │
│      Segunda Tela           │
│                             │
│         [Voltar]            │
│                             │
│                             │
└─────────────────────────────┘
```

**Componentes:**
- **TextView** - Título "Segunda Tela"
- **Button** - Botão "Voltar"

---

## 💡 Como Funciona a Navegação

### 1. Ir para a Segunda Tela

Na `MainActivity`, o botão "Ir para Tela 2" utiliza `Intent` para navegar:

```java
btnTela2.setOnClickListener(v -> {
    Intent intent = new Intent(
        MainActivity.this,
        Tela2Activity.class
    );
    startActivity(intent);
});
```

**O que acontece:**
1. Um `Intent` é criado especificando a atividade de destino
2. `startActivity()` inicia a nova tela
3. A Tela2Activity é exibida

### 2. Voltar para a Tela Anterior

Na `Tela2Activity`, o botão "Voltar" encerra a atividade atual:

```java
btnVoltar.setOnClickListener(v -> finish());
```

**O que acontece:**
1. O método `finish()` encerra a atividade
2. O usuário retorna automaticamente para MainActivity
3. A navegação volta é mantida no histórico do Android

---

## 🛠️ Tecnologias e Ferramentas

Para o desenvolvimento deste projeto, foram utilizadas:

- **Linguagem:** [Java](https://www.java.com/pt-BR/)
- **Layout:** XML (ConstraintLayout)
- **IDE:** [Android Studio](https://developer.android.com/studio)
- **Gerenciador de Dependências:** Gradle
- **API Mínima:** Android 7.0 (API 24)

---

## 📋 Requisitos do Projeto

### Configurações Iniciais

| Configuração | Valor |
|-------------|-------|
| Project Name | Troca de Telas |
| Package Name | br.ulbra.trocadetelas |
| Linguagem | Java |
| Minimum SDK | API 24 (Android 7.0) |

### Activities Necessárias

1. **MainActivity** (criada automaticamente)
   - Layout: `activity_main.xml`
   - Arquivo: `MainActivity.java`

2. **Tela2Activity** (criada manualmente)
   - Layout: `activity_tela2.xml`
   - Arquivo: `Tela2Activity.java`

---

## 📁 Estrutura do Projeto

```
TrocaDeTelas/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── br/ulbra/trocadetelas/
│   │   │   │       ├── MainActivity.java
│   │   │   │       └── Tela2Activity.java
│   │   │   └── res/
│   │   │       └── layout/
│   │   │           ├── activity_main.xml
│   │   │           └── activity_tela2.xml
│   └── build.gradle
└── README.md
```

---

## 📚 Conceitos Principais

### Intent

A classe `Intent` é um componente Android essencial para navegação:

```java
Intent intent = new Intent(contextoAtual, AtividadeDestino.class);
startActivity(intent);
```

**Características:**
- Facilita a comunicação entre Activities
- Pode passar dados entre telas
- Inicia novas Activities ou serviços

### startActivity()

Método que inicia uma nova atividade:

```java
startActivity(intent);
```

**O que faz:**
- Executa a Activity especificada no Intent
- Adiciona a tela anterior ao histórico (back stack)
- Permite navegação de retorno

### finish()

Método que encerra a atividade atual:

```java
finish();
```

**O que faz:**
- Fecha a Activity atual
- Retorna para a tela anterior
- Remove a atividade do histórico

---

## 🔄 Ciclo de Vida da Activity

Quando você navega entre telas, as Activities passam por diferentes estados:

```
onCreate() → onStart() → onResume() → (Ativa)
    ↓         ↓          ↓
onPause() ← onStop() ← onDestroy()
```

**Na navegação entre telas:**

1. **MainActivity está em execução** → Estado RESUMED
2. **Clica "Ir para Tela 2"** → MainActivity vai para PAUSED/STOPPED
3. **Tela2Activity inicia** → onCreate() → onStart() → onResume()
4. **Clica "Voltar"** → Tela2Activity chama finish() → onDestroy()
5. **MainActivity volta** → onStart() → onResume()

---

## 💡 Conceitos Aprendidos

Durante o desenvolvimento desta aplicação, aprendemos:

1. **ConstraintLayout** - Layout responsivo e moderno
2. **Multiple Activities** - Criar e gerenciar múltiplas telas
3. **Intent** - Navegação entre Activities
4. **startActivity()** - Iniciar novas telas
5. **finish()** - Encerrar Activity atual
6. **Eventos de Clique** - Manipulação de clicks em botões
7. **findViewById()** - Ligação de componentes XML ao Java
8. **Back Stack** - Histórico de navegação do Android
9. **Lambda Expressions** - Sintaxe moderna em Java 8+

---

## 🚀 Como Executar

1. **Abra o Android Studio**
2. **Crie um novo projeto** com as configurações listadas acima
3. **Crie a MainActivity** com o layout e código fornecido
4. **Crie a Tela2Activity** (New → Activity → Empty Views Activity)
5. **Implemente os layouts** XML conforme especificado
6. **Adicione o código Java** em cada Activity
7. **Compile o projeto** - Build > Rebuild Project
8. **Execute no emulador** - Run > Run 'app'
9. **Teste a navegação:**
   - Clique em "Ir para Tela 2" para navegar
   - Clique em "Voltar" para retornar
   - Use o botão "back" do Android para voltar

---

## ✅ Resultado Final

O aplicativo apresentará:

✅ Tela Principal com título e botão de navegação  
✅ Segunda Tela com título e botão de retorno  
✅ Navegação fluida entre as telas  
✅ Histórico de navegação funcionando corretamente  
✅ Interface responsiva para diferentes tamanhos de tela  

---

## 🎓 Diferenças entre Métodos de Navegação

### Usando finish()

```java
// Volta para tela anterior
btnVoltar.setOnClickListener(v -> finish());
```

**Vantagens:**
- Simples e direto
- Mantém o histórico do Android
- Automático no botão "back"

### Usando Intent com Back Navigation

```java
// Volta com Intent (não recomendado)
Intent intent = new Intent(this, MainActivity.class);
startActivity(intent);
finish();
```

**Desvantagens:**
- Cria uma nova instância da Activity
- Não usa o back stack
- Menos eficiente em memória

---

## 🔧 Troubleshooting

### Problema: Aplicativo crasha ao clicar no botão

**Solução:**
- Verifique se o ID do botão no XML corresponde ao `findViewById()`
- Verifique se Tela2Activity foi registrada no `AndroidManifest.xml`

### Problema: Não consegue voltar para tela anterior

**Solução:**
- Use `finish()` em vez de criar uma nova Intent
- Verifique se o botão está vinculado corretamente
- Teste o botão "back" do emulador

---

## 💡 Ideias para Expansão

- 🎯 Adicionar uma terceira tela
- 📤 Passar dados entre telas usando Intent
- 🎨 Aplicar animações de transição
- 💾 Salvar estado da aplicação
- 🔐 Implementar validação antes de navegar
- 📱 Adaptar layout para landscape
- ⚡ Usar Navigation Component (mais moderno)

---

## 👨‍💻 Autor

Desenvolvido como atividade de aprendizado em Android com Java.

---

## 📝 Licença

Este projeto é fornecido como material educacional.

---

## 🤝 Contribuições

Sugestões e melhorias são bem-vindas!
