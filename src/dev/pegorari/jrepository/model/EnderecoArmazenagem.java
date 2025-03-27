package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EnderecoArmazenagem extends AbstractSankhyaEntity<EnderecoArmazenagem> {
   public BigDecimal getAltura() {
        return this.getVo().asBigDecimal("ALTURA");
   }

   public void setAltura(BigDecimal altura) {
        markAsChanged("ALTURA", altura);
   }

   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getApenasContPorProd() {
        return this.getVo().asString("APENASCONTPORPROD");
   }

   public void setApenasContPorProd(String apenasContPorProd) {
        markAsChanged("APENASCONTPORPROD", apenasContPorProd);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getBloqueado() {
        return this.getVo().asString("BLOQUEADO");
   }

   public void setBloqueado(String bloqueado) {
        markAsChanged("BLOQUEADO", bloqueado);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodEndPai() {
        return this.getVo().asBigDecimal("CODENDPAI");
   }

   public void setCodEndPai(BigDecimal codEndPai) {
        markAsChanged("CODENDPAI", codEndPai);
   }

   public BigDecimal getCodEndPref() {
        return this.getVo().asBigDecimal("CODENDPREF");
   }

   public void setCodEndPref(BigDecimal codEndPref) {
        markAsChanged("CODENDPREF", codEndPref);
   }

   public BigDecimal getCodEndSec() {
        return this.getVo().asBigDecimal("CODENDSEC");
   }

   public void setCodEndSec(BigDecimal codEndSec) {
        markAsChanged("CODENDSEC", codEndSec);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodUsuTarContagem() {
        return this.getVo().asBigDecimal("CODUSUTARCONTAGEM");
   }

   public void setCodUsuTarContagem(BigDecimal codUsuTarContagem) {
        markAsChanged("CODUSUTARCONTAGEM", codUsuTarContagem);
   }

   public String getConexaoEntrada() {
        return this.getVo().asString("CONEXAOENTRADA");
   }

   public void setConexaoEntrada(String conexaoEntrada) {
        markAsChanged("CONEXAOENTRADA", conexaoEntrada);
   }

   public String getConexaoSaida() {
        return this.getVo().asString("CONEXAOSAIDA");
   }

   public void setConexaoSaida(String conexaoSaida) {
        markAsChanged("CONEXAOSAIDA", conexaoSaida);
   }

   public String getDescrEnd() {
        return this.getVo().asString("DESCREND");
   }

   public void setDescrEnd(String descrEnd) {
        markAsChanged("DESCREND", descrEnd);
   }

   public String getEndereco() {
        return this.getVo().asString("ENDERECO");
   }

   public void setEndereco(String endereco) {
        markAsChanged("ENDERECO", endereco);
   }

   public String getEndMovVertical() {
        return this.getVo().asString("ENDMOVVERTICAL");
   }

   public void setEndMovVertical(String endMovVertical) {
        markAsChanged("ENDMOVVERTICAL", endMovVertical);
   }

   public String getExclConf() {
        return this.getVo().asString("EXCLCONF");
   }

   public void setExclConf(String exclConf) {
        markAsChanged("EXCLCONF", exclConf);
   }

   public String getExpedicao() {
        return this.getVo().asString("EXPEDICAO");
   }

   public void setExpedicao(String expedicao) {
        markAsChanged("EXPEDICAO", expedicao);
   }

   public String getFlowRack() {
        return this.getVo().asString("FLOWRACK");
   }

   public void setFlowRack(String flowRack) {
        markAsChanged("FLOWRACK", flowRack);
   }

   public String getFragmentaEst() {
        return this.getVo().asString("FRAGMENTAEST");
   }

   public void setFragmentaEst(String fragmentaEst) {
        markAsChanged("FRAGMENTAEST", fragmentaEst);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public BigDecimal getLargura() {
        return this.getVo().asBigDecimal("LARGURA");
   }

   public void setLargura(BigDecimal largura) {
        markAsChanged("LARGURA", largura);
   }

   public BigDecimal getM3Max() {
        return this.getVo().asBigDecimal("M3MAX");
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
   }

   public String getMultiProd() {
        return this.getVo().asString("MULTIPROD");
   }

   public void setMultiProd(String multiProd) {
        markAsChanged("MULTIPROD", multiProd);
   }

   public BigDecimal getNivel() {
        return this.getVo().asBigDecimal("NIVEL");
   }

   public void setNivel(BigDecimal nivel) {
        markAsChanged("NIVEL", nivel);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getPar() {
        return this.getVo().asString("PAR");
   }

   public void setPar(String par) {
        markAsChanged("PAR", par);
   }

   public BigDecimal getPesoMax() {
        return this.getVo().asBigDecimal("PESOMAX");
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
   }

   public String getPicking() {
        return this.getVo().asString("PICKING");
   }

   public void setPicking(String picking) {
        markAsChanged("PICKING", picking);
   }

   public String getPickingIntermediario() {
        return this.getVo().asString("PICKINGINTERMEDIARIO");
   }

   public void setPickingIntermediario(String pickingIntermediario) {
        markAsChanged("PICKINGINTERMEDIARIO", pickingIntermediario);
   }

   public String getPossuiContPend() {
        return this.getVo().asString("POSSUICONTPEND");
   }

   public void setPossuiContPend(String possuiContPend) {
        markAsChanged("POSSUICONTPEND", possuiContPend);
   }

   public String getPossuiEstoque() {
        return this.getVo().asString("POSSUIESTOQUE");
   }

   public void setPossuiEstoque(String possuiEstoque) {
        markAsChanged("POSSUIESTOQUE", possuiEstoque);
   }

   public BigDecimal getProfundidade() {
        return this.getVo().asBigDecimal("PROFUNDIDADE");
   }

   public void setProfundidade(BigDecimal profundidade) {
        markAsChanged("PROFUNDIDADE", profundidade);
   }

   public String getProibirControle() {
        return this.getVo().asString("PROIBIRCONTROLE");
   }

   public void setProibirControle(String proibirControle) {
        markAsChanged("PROIBIRCONTROLE", proibirControle);
   }

   public String getProibirGrupo() {
        return this.getVo().asString("PROIBIRGRUPO");
   }

   public void setProibirGrupo(String proibirGrupo) {
        markAsChanged("PROIBIRGRUPO", proibirGrupo);
   }

   public String getProibirLocal() {
        return this.getVo().asString("PROIBIRLOCAL");
   }

   public void setProibirLocal(String proibirLocal) {
        markAsChanged("PROIBIRLOCAL", proibirLocal);
   }

   public String getProibirProduto() {
        return this.getVo().asString("PROIBIRPRODUTO");
   }

   public void setProibirProduto(String proibirProduto) {
        markAsChanged("PROIBIRPRODUTO", proibirProduto);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getUsaPickingIntermediario() {
        return this.getVo().asString("USAPICKINGINTERMEDIARIO");
   }

   public void setUsaPickingIntermediario(String usaPickingIntermediario) {
        markAsChanged("USAPICKINGINTERMEDIARIO", usaPickingIntermediario);
   }

   public String getCrossDock() {
        return this.getVo().asString("CROSSDOCK");
   }

   public void setCrossDock(String crossDock) {
        markAsChanged("CROSSDOCK", crossDock);
   }

   public String getReabPick() {
        return this.getVo().asString("REABPICK");
   }

   public void setReabPick(String reabPick) {
        markAsChanged("REABPICK", reabPick);
   }

   public BigDecimal getNroMaxProd() {
        return this.getVo().asBigDecimal("NROMAXPROD");
   }

   public void setNroMaxProd(BigDecimal nroMaxProd) {
        markAsChanged("NROMAXPROD", nroMaxProd);
   }

   public String getLoteUnico() {
        return this.getVo().asString("LOTEUNICO");
   }

   public void setLoteUnico(String loteUnico) {
        markAsChanged("LOTEUNICO", loteUnico);
   }

   public BigDecimal getQtdMaxUma() {
        return this.getVo().asBigDecimal("QTDMAXUMA");
   }

   public void setQtdMaxUma(BigDecimal qtdMaxUma) {
        markAsChanged("QTDMAXUMA", qtdMaxUma);
   }

   public String getUtilizaUma() {
        return this.getVo().asString("UTILIZAUMA");
   }

   public void setUtilizaUma(String utilizaUma) {
        markAsChanged("UTILIZAUMA", utilizaUma);
   }

   @Override
   public String getTableName() {
        return "TGWEND";
   }

   @Override
   public String getEntityName() {
        return "EnderecoArmazenagem";
   }

   @Override
   public EnderecoArmazenagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
