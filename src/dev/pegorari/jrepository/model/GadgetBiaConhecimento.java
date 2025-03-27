package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GadgetBiaConhecimento extends AbstractSankhyaEntity<GadgetBiaConhecimento> {
   public BigDecimal getCodGbc() {
        return this.getVo().asBigDecimal("CODGBC");
   }

   public void setCodGbc(BigDecimal codGbc) {
        markAsChanged("CODGBC", codGbc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuDsb() {
        return this.getVo().asBigDecimal("NUDSB");
   }

   public void setNuDsb(BigDecimal nuDsb) {
        markAsChanged("NUDSB", nuDsb);
   }

   public String getPergunta() {
        return this.getVo().asString("PERGUNTA");
   }

   public void setPergunta(String pergunta) {
        markAsChanged("PERGUNTA", pergunta);
   }

   public BigDecimal getQtdUso() {
        return this.getVo().asBigDecimal("QTDUSO");
   }

   public void setQtdUso(BigDecimal qtdUso) {
        markAsChanged("QTDUSO", qtdUso);
   }

   public String getResourceId() {
        return this.getVo().asString("RESOURCEID");
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
   }

   @Override
   public String getTableName() {
        return "TSIGBC";
   }

   @Override
   public String getEntityName() {
        return "GadgetBiaConhecimento";
   }

   @Override
   public GadgetBiaConhecimento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
