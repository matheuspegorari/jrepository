package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MotivosPerda extends AbstractSankhyaEntity<MotivosPerda> {
   private String ativo;
   private BigDecimal codMpe;
   private String descricao;
   private String motivoPerda;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodMpe() {
        return codMpe;
   }

   public void setCodMpe(BigDecimal codMpe) {
        this.codMpe = codMpe;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getMotivoPerda() {
        return motivoPerda;
   }

   public void setMotivoPerda(String motivoPerda) {
        this.motivoPerda = motivoPerda;
   }

   @Override
   public String getTableName() {
        return "TPRMPE";
   }

   @Override
   public String getEntityName() {
        return "MotivosPerda";
   }

   @Override
   public MotivosPerda fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codMpe = vo.asBigDecimal("CODMPE");
        this.descricao = vo.asString("DESCRICAO");
        this.motivoPerda = vo.asString("MOTIVOPERDA");
        return this;
   }
}
