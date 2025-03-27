package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConsolidacaoAcessos extends AbstractSankhyaEntity<ConsolidacaoAcessos> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public String getConsultar() {
        return this.getVo().asString("CONSULTAR");
   }

   public void setConsultar(String consultar) {
        markAsChanged("CONSULTAR", consultar);
   }

   public BigDecimal getCodConfig() {
        return this.getVo().asBigDecimal("CODCONFIG");
   }

   public void setCodConfig(BigDecimal codConfig) {
        markAsChanged("CODCONFIG", codConfig);
   }

   @Override
   public String getTableName() {
        return "TGFUCM";
   }

   @Override
   public String getEntityName() {
        return "ConsolidacaoAcessos";
   }

   @Override
   public ConsolidacaoAcessos fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
