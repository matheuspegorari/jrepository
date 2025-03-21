package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ListaServicoSintegra extends AbstractSankhyaEntity<ListaServicoSintegra> {
   private String analitico;
   private String ativo;
   private BigDecimal codLst;
   private BigDecimal codLstPai;
   private String descrLst;
   private BigDecimal grau;
   private String informaCodObra;
   private BigDecimal tipoRepasse;
   private String geraVlrTotRec;
   private String desdNac;

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
        this.codLst = codLst;
   }

   public BigDecimal getCodLstPai() {
        return codLstPai;
   }

   public void setCodLstPai(BigDecimal codLstPai) {
        markAsChanged("CODLSTPAI", codLstPai);
        this.codLstPai = codLstPai;
   }

   public String getDescrLst() {
        return descrLst;
   }

   public void setDescrLst(String descrLst) {
        markAsChanged("DESCRLST", descrLst);
        this.descrLst = descrLst;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getInformaCodObra() {
        return informaCodObra;
   }

   public void setInformaCodObra(String informaCodObra) {
        markAsChanged("INFORMACODOBRA", informaCodObra);
        this.informaCodObra = informaCodObra;
   }

   public BigDecimal getTipoRepasse() {
        return tipoRepasse;
   }

   public void setTipoRepasse(BigDecimal tipoRepasse) {
        markAsChanged("TIPOREPASSE", tipoRepasse);
        this.tipoRepasse = tipoRepasse;
   }

   public String getGeraVlrTotRec() {
        return geraVlrTotRec;
   }

   public void setGeraVlrTotRec(String geraVlrTotRec) {
        markAsChanged("GERAVLRTOTREC", geraVlrTotRec);
        this.geraVlrTotRec = geraVlrTotRec;
   }

   public String getDesdNac() {
        return desdNac;
   }

   public void setDesdNac(String desdNac) {
        markAsChanged("DESDNAC", desdNac);
        this.desdNac = desdNac;
   }

   @Override
   public String getTableName() {
        return "TGFLST";
   }

   @Override
   public String getEntityName() {
        return "ListaServicoSintegra";
   }

   @Override
   public ListaServicoSintegra fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codLst = vo.asBigDecimal("CODLST");
        this.codLstPai = vo.asBigDecimal("CODLSTPAI");
        this.descrLst = vo.asString("DESCRLST");
        this.grau = vo.asBigDecimal("GRAU");
        this.informaCodObra = vo.asString("INFORMACODOBRA");
        this.tipoRepasse = vo.asBigDecimal("TIPOREPASSE");
        this.geraVlrTotRec = vo.asString("GERAVLRTOTREC");
        this.desdNac = vo.asString("DESDNAC");
        return this;
   }
}
