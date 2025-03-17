package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MotivosParada extends AbstractSankhyaEntity<MotivosParada> {
   private String ativo;
   private BigDecimal codMtp;
   private String descricao;
   private String motivoParada;
   private String planejada;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodMtp() {
        return codMtp;
   }

   public void setCodMtp(BigDecimal codMtp) {
        this.codMtp = codMtp;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getMotivoParada() {
        return motivoParada;
   }

   public void setMotivoParada(String motivoParada) {
        this.motivoParada = motivoParada;
   }

   public String getPlanejada() {
        return planejada;
   }

   public void setPlanejada(String planejada) {
        this.planejada = planejada;
   }

   @Override
   public String getTableName() {
        return "TPRMTP";
   }

   @Override
   public String getEntityName() {
        return "MotivosParada";
   }

   @Override
   public MotivosParada fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codMtp = vo.asBigDecimal("CODMTP");
        this.descricao = vo.asString("DESCRICAO");
        this.motivoParada = vo.asString("MOTIVOPARADA");
        this.planejada = vo.asString("PLANEJADA");
        return this;
   }
}
