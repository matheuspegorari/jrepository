package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class VolumeAlternativo extends AbstractSankhyaEntity<VolumeAlternativo> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCamadas() {
        return this.getVo().asBigDecimal("CAMADAS");
   }

   public void setCamadas(BigDecimal camadas) {
        markAsChanged("CAMADAS", camadas);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getDescrDanfe() {
        return this.getVo().asString("DESCRDANFE");
   }

   public void setDescrDanfe(String descrDanfe) {
        markAsChanged("DESCRDANFE", descrDanfe);
   }

   public String getDivideMultiplica() {
        return this.getVo().asString("DIVIDEMULTIPLICA");
   }

   public void setDivideMultiplica(String divideMultiplica) {
        markAsChanged("DIVIDEMULTIPLICA", divideMultiplica);
   }

   public BigDecimal getLastro() {
        return this.getVo().asBigDecimal("LASTRO");
   }

   public void setLastro(BigDecimal lastro) {
        markAsChanged("LASTRO", lastro);
   }

   public BigDecimal getM3() {
        return this.getVo().asBigDecimal("M3");
   }

   public void setM3(BigDecimal m3) {
        markAsChanged("M3", m3);
   }

   public BigDecimal getMultiplVlr() {
        return this.getVo().asBigDecimal("MULTIPVLR");
   }

   public void setMultiplVlr(BigDecimal multiplVlr) {
        markAsChanged("MULTIPVLR", multiplVlr);
   }

   public String getOpcaoSep() {
        return this.getVo().asString("OPCAOSEP");
   }

   public void setOpcaoSep(String opcaoSep) {
        markAsChanged("OPCAOSEP", opcaoSep);
   }

   public BigDecimal getQuantidade() {
        return this.getVo().asBigDecimal("QUANTIDADE");
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
   }

   public String getSelecionado() {
        return this.getVo().asString("SELECIONADO");
   }

   public void setSelecionado(String selecionado) {
        markAsChanged("SELECIONADO", selecionado);
   }

   public String getTipCodBarra() {
        return this.getVo().asString("TIPCODBARRA");
   }

   public void setTipCodBarra(String tipCodBarra) {
        markAsChanged("TIPCODBARRA", tipCodBarra);
   }

   public BigDecimal getTipGtinNfe() {
        return this.getVo().asBigDecimal("TIPGTINNFE");
   }

   public void setTipGtinNfe(BigDecimal tipGtinNfe) {
        markAsChanged("TIPGTINNFE", tipGtinNfe);
   }

   public String getUnidSelo() {
        return this.getVo().asString("UNIDSELO");
   }

   public void setUnidSelo(String unidSelo) {
        markAsChanged("UNIDSELO", unidSelo);
   }

   public String getUnidTrib() {
        return this.getVo().asString("UNIDTRIB");
   }

   public void setUnidTrib(String unidTrib) {
        markAsChanged("UNIDTRIB", unidTrib);
   }

   public String getUnTribExportacao() {
        return this.getVo().asString("UNTRIBEXPORTACAO");
   }

   public void setUnTribExportacao(String unTribExportacao) {
        markAsChanged("UNTRIBEXPORTACAO", unTribExportacao);
   }

   public String getDescrUnTribExport() {
        return this.getVo().asString("DESCRUNTRIBEXPORT");
   }

   public void setDescrUnTribExport(String descrUnTribExport) {
        markAsChanged("DESCRUNTRIBEXPORT", descrUnTribExport);
   }

   public String getOpcoesGerar0220() {
        return this.getVo().asString("OPCOESGERAR0220");
   }

   public void setOpcoesGerar0220(String opcoesGerar0220) {
        markAsChanged("OPCOESGERAR0220", opcoesGerar0220);
   }

   public BigDecimal getQtdDecimaisUpf() {
        return this.getVo().asBigDecimal("QTDDECIMAISUPF");
   }

   public void setQtdDecimaisUpf(BigDecimal qtdDecimaisUpf) {
        markAsChanged("QTDDECIMAISUPF", qtdDecimaisUpf);
   }

   public String getUndTribRecob() {
        return this.getVo().asString("UNDTRIBRECOB");
   }

   public void setUndTribRecob(String undTribRecob) {
        markAsChanged("UNDTRIBRECOB", undTribRecob);
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
        this.setVo(vo);
        return this;
   }
}
