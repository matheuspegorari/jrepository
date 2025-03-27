package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CentroResultado extends AbstractSankhyaEntity<CentroResultado> {
   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public BigDecimal getArea() {
        return this.getVo().asBigDecimal("AREA");
   }

   public void setArea(BigDecimal area) {
        markAsChanged("AREA", area);
   }

   public BigDecimal getAreaCont() {
        return this.getVo().asBigDecimal("AREACONT");
   }

   public void setAreaCont(BigDecimal areaCont) {
        markAsChanged("AREACONT", areaCont);
   }

   public BigDecimal getAreaPerm() {
        return this.getVo().asBigDecimal("AREAPERM");
   }

   public void setAreaPerm(BigDecimal areaPerm) {
        markAsChanged("AREAPERM", areaPerm);
   }

   public BigDecimal getAreaReal() {
        return this.getVo().asBigDecimal("AREAREAL");
   }

   public void setAreaReal(BigDecimal areaReal) {
        markAsChanged("AREAREAL", areaReal);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCenCus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
   }

   public BigDecimal getCodCenCusPai() {
        return this.getVo().asBigDecimal("CODCENCUSPAI");
   }

   public void setCodCenCusPai(BigDecimal codCenCusPai) {
        markAsChanged("CODCENCUSPAI", codCenCusPai);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodUng() {
        return this.getVo().asBigDecimal("CODUNG");
   }

   public void setCodUng(BigDecimal codUng) {
        markAsChanged("CODUNG", codUng);
   }

   public BigDecimal getCodUnn() {
        return this.getVo().asBigDecimal("CODUNN");
   }

   public void setCodUnn(BigDecimal codUnn) {
        markAsChanged("CODUNN", codUnn);
   }

   public BigDecimal getCodUsuResp() {
        return this.getVo().asBigDecimal("CODUSURESP");
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
   }

   public String getDescrCenCus() {
        return this.getVo().asString("DESCRCENCUS");
   }

   public void setDescrCenCus(String descrCenCus) {
        markAsChanged("DESCRCENCUS", descrCenCus);
   }

   public Timestamp getDtInclusao() {
        return this.getVo().asTimestamp("DTINCLUSAO");
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
   }

   public BigDecimal getFracCont() {
        return this.getVo().asBigDecimal("FRACCONT");
   }

   public void setFracCont(BigDecimal fracCont) {
        markAsChanged("FRACCONT", fracCont);
   }

   public BigDecimal getFracGeren() {
        return this.getVo().asBigDecimal("FRACGEREN");
   }

   public void setFracGeren(BigDecimal fracGeren) {
        markAsChanged("FRACGEREN", fracGeren);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getVeiculo() {
        return this.getVo().asString("VEICULO");
   }

   public void setVeiculo(String veiculo) {
        markAsChanged("VEICULO", veiculo);
   }

   public BigDecimal getCodParcResp() {
        return this.getVo().asBigDecimal("CODPARCRESP");
   }

   public void setCodParcResp(BigDecimal codParcResp) {
        markAsChanged("CODPARCRESP", codParcResp);
   }

   public String getCalcElalurPartea() {
        return this.getVo().asString("CALCELALURPARTEA");
   }

   public void setCalcElalurPartea(String calcElalurPartea) {
        markAsChanged("CALCELALURPARTEA", calcElalurPartea);
   }

   @Override
   public String getTableName() {
        return "TSICUS";
   }

   @Override
   public String getEntityName() {
        return "CentroResultado";
   }

   @Override
   public CentroResultado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
