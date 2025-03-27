package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ListaServicoSintegra extends AbstractSankhyaEntity<ListaServicoSintegra> {
   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodLst() {
        return this.getVo().asBigDecimal("CODLST");
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
   }

   public BigDecimal getCodLstPai() {
        return this.getVo().asBigDecimal("CODLSTPAI");
   }

   public void setCodLstPai(BigDecimal codLstPai) {
        markAsChanged("CODLSTPAI", codLstPai);
   }

   public String getDescrLst() {
        return this.getVo().asString("DESCRLST");
   }

   public void setDescrLst(String descrLst) {
        markAsChanged("DESCRLST", descrLst);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getInformaCodObra() {
        return this.getVo().asString("INFORMACODOBRA");
   }

   public void setInformaCodObra(String informaCodObra) {
        markAsChanged("INFORMACODOBRA", informaCodObra);
   }

   public BigDecimal getTipoRepasse() {
        return this.getVo().asBigDecimal("TIPOREPASSE");
   }

   public void setTipoRepasse(BigDecimal tipoRepasse) {
        markAsChanged("TIPOREPASSE", tipoRepasse);
   }

   public String getGeraVlrTotRec() {
        return this.getVo().asString("GERAVLRTOTREC");
   }

   public void setGeraVlrTotRec(String geraVlrTotRec) {
        markAsChanged("GERAVLRTOTREC", geraVlrTotRec);
   }

   public String getDesdNac() {
        return this.getVo().asString("DESDNAC");
   }

   public void setDesdNac(String desdNac) {
        markAsChanged("DESDNAC", desdNac);
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
        this.setVo(vo);
        return this;
   }
}
