package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoTokenProduto extends AbstractSankhyaEntity<ConfiguracaoTokenProduto> {
   private String ativo;
   private BigDecimal codCfg;
   private Timestamp dhUltExec;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodCfg() {
        return codCfg;
   }

   public void setCodCfg(BigDecimal codCfg) {
        this.codCfg = codCfg;
   }

   public Timestamp getDhUltExec() {
        return dhUltExec;
   }

   public void setDhUltExec(Timestamp dhUltExec) {
        this.dhUltExec = dhUltExec;
   }

   @Override
   public String getTableName() {
        return "TGFTOKCFG";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoTokenProduto";
   }

   @Override
   public ConfiguracaoTokenProduto fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codCfg = vo.asBigDecimal("CODCFG");
        this.dhUltExec = vo.asTimestamp("DHULTEXEC");
        return this;
   }
}
