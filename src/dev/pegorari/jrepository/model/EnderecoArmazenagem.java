package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class EnderecoArmazenagem implements SankhyaEntity<EnderecoArmazenagem> {

   private BigDecimal altura;
   private String analitico;
   private String apenasContPorProd;
   private String ativo;
   private String bloqueado;
   private BigDecimal codEmp;
   private BigDecimal codEnd;
   private BigDecimal codEndPai;
   private BigDecimal codEndPref;
   private BigDecimal codEndSec;
   private BigDecimal codLocal;
   private BigDecimal codUsuTarContagem;
   private String conexaoEntrada;
   private String conexaoSaida;
   private String descrEnd;
   private String endereco;
   private String endMovVertical;
   private String exclConf;
   private String expedicao;
   private String flowRack;
   private String fragmentaEst;
   private BigDecimal grau;
   private BigDecimal largura;
   private BigDecimal m3Max;
   private String multiProd;
   private BigDecimal nivel;
   private BigDecimal ordem;
   private String par;
   private BigDecimal pesoMax;
   private String picking;
   private String pickingIntermediario;
   private String possuiContPend;
   private String possuiEstoque;
   private BigDecimal profundidade;
   private String proibirControle;
   private String proibirGrupo;
   private String proibirLocal;
   private String proibirProduto;
   private String tipo;
   private String usaPickingIntermediario;
   private String crossDock;
   private String reabPick;
   private BigDecimal nroMaxProd;
   private String loteUnico;
   private BigDecimal qtdMaxUma;
   private String utilizaUma;

   public BigDecimal getAltura() {
        return altura;
   }

   public void setAltura(BigDecimal altura) {
        this.altura = altura;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public String getApenasContPorProd() {
        return apenasContPorProd;
   }

   public void setApenasContPorProd(String apenasContPorProd) {
        this.apenasContPorProd = apenasContPorProd;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getBloqueado() {
        return bloqueado;
   }

   public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public BigDecimal getCodEndPai() {
        return codEndPai;
   }

   public void setCodEndPai(BigDecimal codEndPai) {
        this.codEndPai = codEndPai;
   }

   public BigDecimal getCodEndPref() {
        return codEndPref;
   }

   public void setCodEndPref(BigDecimal codEndPref) {
        this.codEndPref = codEndPref;
   }

   public BigDecimal getCodEndSec() {
        return codEndSec;
   }

   public void setCodEndSec(BigDecimal codEndSec) {
        this.codEndSec = codEndSec;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public BigDecimal getCodUsuTarContagem() {
        return codUsuTarContagem;
   }

   public void setCodUsuTarContagem(BigDecimal codUsuTarContagem) {
        this.codUsuTarContagem = codUsuTarContagem;
   }

   public String getConexaoEntrada() {
        return conexaoEntrada;
   }

   public void setConexaoEntrada(String conexaoEntrada) {
        this.conexaoEntrada = conexaoEntrada;
   }

   public String getConexaoSaida() {
        return conexaoSaida;
   }

   public void setConexaoSaida(String conexaoSaida) {
        this.conexaoSaida = conexaoSaida;
   }

   public String getDescrEnd() {
        return descrEnd;
   }

   public void setDescrEnd(String descrEnd) {
        this.descrEnd = descrEnd;
   }

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        this.endereco = endereco;
   }

   public String getEndMovVertical() {
        return endMovVertical;
   }

   public void setEndMovVertical(String endMovVertical) {
        this.endMovVertical = endMovVertical;
   }

   public String getExclConf() {
        return exclConf;
   }

   public void setExclConf(String exclConf) {
        this.exclConf = exclConf;
   }

   public String getExpedicao() {
        return expedicao;
   }

   public void setExpedicao(String expedicao) {
        this.expedicao = expedicao;
   }

   public String getFlowRack() {
        return flowRack;
   }

   public void setFlowRack(String flowRack) {
        this.flowRack = flowRack;
   }

   public String getFragmentaEst() {
        return fragmentaEst;
   }

   public void setFragmentaEst(String fragmentaEst) {
        this.fragmentaEst = fragmentaEst;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   public BigDecimal getLargura() {
        return largura;
   }

   public void setLargura(BigDecimal largura) {
        this.largura = largura;
   }

   public BigDecimal getM3Max() {
        return m3Max;
   }

   public void setM3Max(BigDecimal m3Max) {
        this.m3Max = m3Max;
   }

   public String getMultiProd() {
        return multiProd;
   }

   public void setMultiProd(String multiProd) {
        this.multiProd = multiProd;
   }

   public BigDecimal getNivel() {
        return nivel;
   }

   public void setNivel(BigDecimal nivel) {
        this.nivel = nivel;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getPar() {
        return par;
   }

   public void setPar(String par) {
        this.par = par;
   }

   public BigDecimal getPesoMax() {
        return pesoMax;
   }

   public void setPesoMax(BigDecimal pesoMax) {
        this.pesoMax = pesoMax;
   }

   public String getPicking() {
        return picking;
   }

   public void setPicking(String picking) {
        this.picking = picking;
   }

   public String getPickingIntermediario() {
        return pickingIntermediario;
   }

   public void setPickingIntermediario(String pickingIntermediario) {
        this.pickingIntermediario = pickingIntermediario;
   }

   public String getPossuiContPend() {
        return possuiContPend;
   }

   public void setPossuiContPend(String possuiContPend) {
        this.possuiContPend = possuiContPend;
   }

   public String getPossuiEstoque() {
        return possuiEstoque;
   }

   public void setPossuiEstoque(String possuiEstoque) {
        this.possuiEstoque = possuiEstoque;
   }

   public BigDecimal getProfundidade() {
        return profundidade;
   }

   public void setProfundidade(BigDecimal profundidade) {
        this.profundidade = profundidade;
   }

   public String getProibirControle() {
        return proibirControle;
   }

   public void setProibirControle(String proibirControle) {
        this.proibirControle = proibirControle;
   }

   public String getProibirGrupo() {
        return proibirGrupo;
   }

   public void setProibirGrupo(String proibirGrupo) {
        this.proibirGrupo = proibirGrupo;
   }

   public String getProibirLocal() {
        return proibirLocal;
   }

   public void setProibirLocal(String proibirLocal) {
        this.proibirLocal = proibirLocal;
   }

   public String getProibirProduto() {
        return proibirProduto;
   }

   public void setProibirProduto(String proibirProduto) {
        this.proibirProduto = proibirProduto;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getUsaPickingIntermediario() {
        return usaPickingIntermediario;
   }

   public void setUsaPickingIntermediario(String usaPickingIntermediario) {
        this.usaPickingIntermediario = usaPickingIntermediario;
   }

   public String getCrossDock() {
        return crossDock;
   }

   public void setCrossDock(String crossDock) {
        this.crossDock = crossDock;
   }

   public String getReabPick() {
        return reabPick;
   }

   public void setReabPick(String reabPick) {
        this.reabPick = reabPick;
   }

   public BigDecimal getNroMaxProd() {
        return nroMaxProd;
   }

   public void setNroMaxProd(BigDecimal nroMaxProd) {
        this.nroMaxProd = nroMaxProd;
   }

   public String getLoteUnico() {
        return loteUnico;
   }

   public void setLoteUnico(String loteUnico) {
        this.loteUnico = loteUnico;
   }

   public BigDecimal getQtdMaxUma() {
        return qtdMaxUma;
   }

   public void setQtdMaxUma(BigDecimal qtdMaxUma) {
        this.qtdMaxUma = qtdMaxUma;
   }

   public String getUtilizaUma() {
        return utilizaUma;
   }

   public void setUtilizaUma(String utilizaUma) {
        this.utilizaUma = utilizaUma;
   }

   @Override
   public String getEntityName() {
        return "EnderecoArmazenagem";
   }

   @Override
   public EnderecoArmazenagem fromVO(DynamicVO vo) {
        this.altura = vo.asBigDecimal("ALTURA");
        this.analitico = vo.asString("ANALITICO");
        this.apenasContPorProd = vo.asString("APENASCONTPORPROD");
        this.ativo = vo.asString("ATIVO");
        this.bloqueado = vo.asString("BLOQUEADO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codEndPai = vo.asBigDecimal("CODENDPAI");
        this.codEndPref = vo.asBigDecimal("CODENDPREF");
        this.codEndSec = vo.asBigDecimal("CODENDSEC");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codUsuTarContagem = vo.asBigDecimal("CODUSUTARCONTAGEM");
        this.conexaoEntrada = vo.asString("CONEXAOENTRADA");
        this.conexaoSaida = vo.asString("CONEXAOSAIDA");
        this.descrEnd = vo.asString("DESCREND");
        this.endereco = vo.asString("ENDERECO");
        this.endMovVertical = vo.asString("ENDMOVVERTICAL");
        this.exclConf = vo.asString("EXCLCONF");
        this.expedicao = vo.asString("EXPEDICAO");
        this.flowRack = vo.asString("FLOWRACK");
        this.fragmentaEst = vo.asString("FRAGMENTAEST");
        this.grau = vo.asBigDecimal("GRAU");
        this.largura = vo.asBigDecimal("LARGURA");
        this.m3Max = vo.asBigDecimal("M3MAX");
        this.multiProd = vo.asString("MULTIPROD");
        this.nivel = vo.asBigDecimal("NIVEL");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.par = vo.asString("PAR");
        this.pesoMax = vo.asBigDecimal("PESOMAX");
        this.picking = vo.asString("PICKING");
        this.pickingIntermediario = vo.asString("PICKINGINTERMEDIARIO");
        this.possuiContPend = vo.asString("POSSUICONTPEND");
        this.possuiEstoque = vo.asString("POSSUIESTOQUE");
        this.profundidade = vo.asBigDecimal("PROFUNDIDADE");
        this.proibirControle = vo.asString("PROIBIRCONTROLE");
        this.proibirGrupo = vo.asString("PROIBIRGRUPO");
        this.proibirLocal = vo.asString("PROIBIRLOCAL");
        this.proibirProduto = vo.asString("PROIBIRPRODUTO");
        this.tipo = vo.asString("TIPO");
        this.usaPickingIntermediario = vo.asString("USAPICKINGINTERMEDIARIO");
        this.crossDock = vo.asString("CROSSDOCK");
        this.reabPick = vo.asString("REABPICK");
        this.nroMaxProd = vo.asBigDecimal("NROMAXPROD");
        this.loteUnico = vo.asString("LOTEUNICO");
        this.qtdMaxUma = vo.asBigDecimal("QTDMAXUMA");
        this.utilizaUma = vo.asString("UTILIZAUMA");
        return this;
   }
}
