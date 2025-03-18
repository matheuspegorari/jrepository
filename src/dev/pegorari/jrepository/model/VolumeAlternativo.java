package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class VolumeAlternativo extends AbstractSankhyaEntity<VolumeAlternativo> {
   private String ativo;
   private BigDecimal camadas;
   private String codBarra;
   private BigDecimal codProd;
   private String codVol;
   private String controle;
   private String descrDanfe;
   private String divideMultiplica;
   private BigDecimal lastro;
   private BigDecimal m3;
   private BigDecimal multiplVlr;
   private String opcaoSep;
   private BigDecimal quantidade;
   private String selecionado;
   private String tipCodBarra;
   private BigDecimal tipGtinNfe;
   private String unidSelo;
   private String unidTrib;
   private String unTribExportacao;
   private String descrUnTribExport;
   private String opcoesGerar0220;
   private BigDecimal qtdDecimaisUpf;
   private String undTribRecob;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCamadas() {
        return camadas;
   }

   public void setCamadas(BigDecimal camadas) {
        markAsChanged("CAMADAS", camadas);
        this.camadas = camadas;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getDescrDanfe() {
        return descrDanfe;
   }

   public void setDescrDanfe(String descrDanfe) {
        markAsChanged("DESCRDANFE", descrDanfe);
        this.descrDanfe = descrDanfe;
   }

   public String getDivideMultiplica() {
        return divideMultiplica;
   }

   public void setDivideMultiplica(String divideMultiplica) {
        markAsChanged("DIVIDEMULTIPLICA", divideMultiplica);
        this.divideMultiplica = divideMultiplica;
   }

   public BigDecimal getLastro() {
        return lastro;
   }

   public void setLastro(BigDecimal lastro) {
        markAsChanged("LASTRO", lastro);
        this.lastro = lastro;
   }

   public BigDecimal getM3() {
        return m3;
   }

   public void setM3(BigDecimal m3) {
        markAsChanged("M3", m3);
        this.m3 = m3;
   }

   public BigDecimal getMultiplVlr() {
        return multiplVlr;
   }

   public void setMultiplVlr(BigDecimal multiplVlr) {
        markAsChanged("MULTIPVLR", multiplVlr);
        this.multiplVlr = multiplVlr;
   }

   public String getOpcaoSep() {
        return opcaoSep;
   }

   public void setOpcaoSep(String opcaoSep) {
        markAsChanged("OPCAOSEP", opcaoSep);
        this.opcaoSep = opcaoSep;
   }

   public BigDecimal getQuantidade() {
        return quantidade;
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
        this.quantidade = quantidade;
   }

   public String getSelecionado() {
        return selecionado;
   }

   public void setSelecionado(String selecionado) {
        markAsChanged("SELECIONADO", selecionado);
        this.selecionado = selecionado;
   }

   public String getTipCodBarra() {
        return tipCodBarra;
   }

   public void setTipCodBarra(String tipCodBarra) {
        markAsChanged("TIPCODBARRA", tipCodBarra);
        this.tipCodBarra = tipCodBarra;
   }

   public BigDecimal getTipGtinNfe() {
        return tipGtinNfe;
   }

   public void setTipGtinNfe(BigDecimal tipGtinNfe) {
        markAsChanged("TIPGTINNFE", tipGtinNfe);
        this.tipGtinNfe = tipGtinNfe;
   }

   public String getUnidSelo() {
        return unidSelo;
   }

   public void setUnidSelo(String unidSelo) {
        markAsChanged("UNIDSELO", unidSelo);
        this.unidSelo = unidSelo;
   }

   public String getUnidTrib() {
        return unidTrib;
   }

   public void setUnidTrib(String unidTrib) {
        markAsChanged("UNIDTRIB", unidTrib);
        this.unidTrib = unidTrib;
   }

   public String getUnTribExportacao() {
        return unTribExportacao;
   }

   public void setUnTribExportacao(String unTribExportacao) {
        markAsChanged("UNTRIBEXPORTACAO", unTribExportacao);
        this.unTribExportacao = unTribExportacao;
   }

   public String getDescrUnTribExport() {
        return descrUnTribExport;
   }

   public void setDescrUnTribExport(String descrUnTribExport) {
        markAsChanged("DESCRUNTRIBEXPORT", descrUnTribExport);
        this.descrUnTribExport = descrUnTribExport;
   }

   public String getOpcoesGerar0220() {
        return opcoesGerar0220;
   }

   public void setOpcoesGerar0220(String opcoesGerar0220) {
        markAsChanged("OPCOESGERAR0220", opcoesGerar0220);
        this.opcoesGerar0220 = opcoesGerar0220;
   }

   public BigDecimal getQtdDecimaisUpf() {
        return qtdDecimaisUpf;
   }

   public void setQtdDecimaisUpf(BigDecimal qtdDecimaisUpf) {
        markAsChanged("QTDDECIMAISUPF", qtdDecimaisUpf);
        this.qtdDecimaisUpf = qtdDecimaisUpf;
   }

   public String getUndTribRecob() {
        return undTribRecob;
   }

   public void setUndTribRecob(String undTribRecob) {
        markAsChanged("UNDTRIBRECOB", undTribRecob);
        this.undTribRecob = undTribRecob;
   }

   @Override
   public String getTableName() {
        return "TGFVOA";
   }

   @Override
   public String getEntityName() {
        return "VolumeAlternativo";
   }

   @Override
   public VolumeAlternativo fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.camadas = vo.asBigDecimal("CAMADAS");
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.descrDanfe = vo.asString("DESCRDANFE");
        this.divideMultiplica = vo.asString("DIVIDEMULTIPLICA");
        this.lastro = vo.asBigDecimal("LASTRO");
        this.m3 = vo.asBigDecimal("M3");
        this.multiplVlr = vo.asBigDecimal("MULTIPVLR");
        this.opcaoSep = vo.asString("OPCAOSEP");
        this.quantidade = vo.asBigDecimal("QUANTIDADE");
        this.selecionado = vo.asString("SELECIONADO");
        this.tipCodBarra = vo.asString("TIPCODBARRA");
        this.tipGtinNfe = vo.asBigDecimal("TIPGTINNFE");
        this.unidSelo = vo.asString("UNIDSELO");
        this.unidTrib = vo.asString("UNIDTRIB");
        this.unTribExportacao = vo.asString("UNTRIBEXPORTACAO");
        this.descrUnTribExport = vo.asString("DESCRUNTRIBEXPORT");
        this.opcoesGerar0220 = vo.asString("OPCOESGERAR0220");
        this.qtdDecimaisUpf = vo.asBigDecimal("QTDDECIMAISUPF");
        this.undTribRecob = vo.asString("UNDTRIBRECOB");
        return this;
   }
}
