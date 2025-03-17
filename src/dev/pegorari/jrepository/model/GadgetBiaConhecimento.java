package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class GadgetBiaConhecimento implements SankhyaEntity<GadgetBiaConhecimento> {

   private BigDecimal codGbc;
   private BigDecimal codUsu;
   private BigDecimal nuDsb;
   private String pergunta;
   private BigDecimal qtdUso;
   private String resourceId;

   public BigDecimal getCodGbc() {
        return codGbc;
   }

   public void setCodGbc(BigDecimal codGbc) {
        this.codGbc = codGbc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuDsb() {
        return nuDsb;
   }

   public void setNuDsb(BigDecimal nuDsb) {
        this.nuDsb = nuDsb;
   }

   public String getPergunta() {
        return pergunta;
   }

   public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
   }

   public BigDecimal getQtdUso() {
        return qtdUso;
   }

   public void setQtdUso(BigDecimal qtdUso) {
        this.qtdUso = qtdUso;
   }

   public String getResourceId() {
        return resourceId;
   }

   public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
   }

   @Override
   public String getEntityName() {
        return "GadgetBiaConhecimento";
   }

   @Override
   public GadgetBiaConhecimento fromVO(DynamicVO vo) {
        this.codGbc = vo.asBigDecimal("CODGBC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuDsb = vo.asBigDecimal("NUDSB");
        this.pergunta = vo.asString("PERGUNTA");
        this.qtdUso = vo.asBigDecimal("QTDUSO");
        this.resourceId = vo.asString("RESOURCEID");
        return this;
   }
}
