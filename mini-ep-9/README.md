## Mini EP 9 (Teste com Selenium)

Esse projeto conta com 2 casos de teste para exemplificar o uso do Selenium

## Requisitos

- Python 3
- Selenium
- Web Driver do Firefox (geckodriver)

## Ambiente de Teste

Instale a biblioteca do selenium

```shell
pip install selenium
```

Instale o web driver do Firefox. Assumindo que `~/.local/bin/` está no seu PATH:

```shell
wget https://github.com/mozilla/geckodriver/releases/download/v0.19.1/geckodriver-v0.19.1-linux64.tar.gz
tar xvfz geckodriver-v0.19.1-linux64.tar.gz
mv geckodriver ~/.local/bin
```

## Execução dos testes

Para executar os testes basta fazer

```shell
python ./main.py
```
