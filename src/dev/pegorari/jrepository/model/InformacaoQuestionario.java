package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoQuestionario implements SankhyaEntity<InformacaoQuestionario> {

   private BigDecimal codQuest;
   private BigDecimal codUsu;
   private String descricao;
   private Timestamp dhAlter;
   private BigDecimal sequencia;
   private String texto;

   public BigDecimal getCodQuest() {
        return codQuest;
   }

   public void setCodQuest(BigDecimal codQuest) {
        this.codQuest = codQuest;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        this.texto = texto;
   }

   @Override
   public String getEntityName() {
        return "InformacaoQuestionario";
   }

   @Override
   public InformacaoQuestionario fromVO(DynamicVO vo) {
        this.codQuest = vo.asBigDecimal("CODQUEST");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descricao = vo.asString("DESCRICAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.texto = vo.asString("TEXTO");
        return this;
   }
}
