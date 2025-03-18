package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CentroResultado extends AbstractSankhyaEntity<CentroResultado> {
   private String analitico;
   private BigDecimal area;
   private BigDecimal areaCont;
   private BigDecimal areaPerm;
   private BigDecimal areaReal;
   private String ativo;
   private BigDecimal codCenCus;
   private BigDecimal codCenCusPai;
   private BigDecimal codParc;
   private BigDecimal codTab;
   private BigDecimal codUng;
   private BigDecimal codUnn;
   private BigDecimal codUsuResp;
   private String descrCenCus;
   private Timestamp dtInclusao;
   private BigDecimal fracCont;
   private BigDecimal fracGeren;
   private BigDecimal grau;
   private String veiculo;
   private BigDecimal codParcResp;
   private String calcElalurPartea;

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public BigDecimal getArea() {
        return area;
   }

   public void setArea(BigDecimal area) {
        markAsChanged("AREA", area);
        this.area = area;
   }

   public BigDecimal getAreaCont() {
        return areaCont;
   }

   public void setAreaCont(BigDecimal areaCont) {
        markAsChanged("AREACONT", areaCont);
        this.areaCont = areaCont;
   }

   public BigDecimal getAreaPerm() {
        return areaPerm;
   }

   public void setAreaPerm(BigDecimal areaPerm) {
        markAsChanged("AREAPERM", areaPerm);
        this.areaPerm = areaPerm;
   }

   public BigDecimal getAreaReal() {
        return areaReal;
   }

   public void setAreaReal(BigDecimal areaReal) {
        markAsChanged("AREAREAL", areaReal);
        this.areaReal = areaReal;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodCenCusPai() {
        return codCenCusPai;
   }

   public void setCodCenCusPai(BigDecimal codCenCusPai) {
        markAsChanged("CODCENCUSPAI", codCenCusPai);
        this.codCenCusPai = codCenCusPai;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public BigDecimal getCodUng() {
        return codUng;
   }

   public void setCodUng(BigDecimal codUng) {
        markAsChanged("CODUNG", codUng);
        this.codUng = codUng;
   }

   public BigDecimal getCodUnn() {
        return codUnn;
   }

   public void setCodUnn(BigDecimal codUnn) {
        markAsChanged("CODUNN", codUnn);
        this.codUnn = codUnn;
   }

   public BigDecimal getCodUsuResp() {
        return codUsuResp;
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
        this.codUsuResp = codUsuResp;
   }

   public String getDescrCenCus() {
        return descrCenCus;
   }

   public void setDescrCenCus(String descrCenCus) {
        markAsChanged("DESCRCENCUS", descrCenCus);
        this.descrCenCus = descrCenCus;
   }

   public Timestamp getDtInclusao() {
        return dtInclusao;
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
        this.dtInclusao = dtInclusao;
   }

   public BigDecimal getFracCont() {
        return fracCont;
   }

   public void setFracCont(BigDecimal fracCont) {
        markAsChanged("FRACCONT", fracCont);
        this.fracCont = fracCont;
   }

   public BigDecimal getFracGeren() {
        return fracGeren;
   }

   public void setFracGeren(BigDecimal fracGeren) {
        markAsChanged("FRACGEREN", fracGeren);
        this.fracGeren = fracGeren;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getVeiculo() {
        return veiculo;
   }

   public void setVeiculo(String veiculo) {
        markAsChanged("VEICULO", veiculo);
        this.veiculo = veiculo;
   }

   public BigDecimal getCodParcResp() {
        return codParcResp;
   }

   public void setCodParcResp(BigDecimal codParcResp) {
        markAsChanged("CODPARCRESP", codParcResp);
        this.codParcResp = codParcResp;
   }

   public String getCalcElalurPartea() {
        return calcElalurPartea;
   }

   public void setCalcElalurPartea(String calcElalurPartea) {
        markAsChanged("CALCELALURPARTEA", calcElalurPartea);
        this.calcElalurPartea = calcElalurPartea;
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
        this.setOriginalVO(vo);
        this.analitico = vo.asString("ANALITICO");
        this.area = vo.asBigDecimal("AREA");
        this.areaCont = vo.asBigDecimal("AREACONT");
        this.areaPerm = vo.asBigDecimal("AREAPERM");
        this.areaReal = vo.asBigDecimal("AREAREAL");
        this.ativo = vo.asString("ATIVO");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
        this.codCenCusPai = vo.asBigDecimal("CODCENCUSPAI");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codUng = vo.asBigDecimal("CODUNG");
        this.codUnn = vo.asBigDecimal("CODUNN");
        this.codUsuResp = vo.asBigDecimal("CODUSURESP");
        this.descrCenCus = vo.asString("DESCRCENCUS");
        this.dtInclusao = vo.asTimestamp("DTINCLUSAO");
        this.fracCont = vo.asBigDecimal("FRACCONT");
        this.fracGeren = vo.asBigDecimal("FRACGEREN");
        this.grau = vo.asBigDecimal("GRAU");
        this.veiculo = vo.asString("VEICULO");
        this.codParcResp = vo.asBigDecimal("CODPARCRESP");
        this.calcElalurPartea = vo.asString("CALCELALURPARTEA");
        return this;
   }
}
