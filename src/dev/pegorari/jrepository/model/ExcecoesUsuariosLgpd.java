package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExcecoesUsuariosLgpd extends AbstractSankhyaEntity<ExcecoesUsuariosLgpd> {
   private BigDecimal codCla;
   private BigDecimal codUsu;
   private String tipoVisu;

   public BigDecimal getCodCla() {
        return codCla;
   }

   public void setCodCla(BigDecimal codCla) {
        this.codCla = codCla;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getTipoVisu() {
        return tipoVisu;
   }

   public void setTipoVisu(String tipoVisu) {
        this.tipoVisu = tipoVisu;
   }

   @Override
   public String getTableName() {
        return "TSIEXU";
   }

   @Override
   public String getEntityName() {
        return "ExcecoesUsuariosLgpd";
   }

   @Override
   public ExcecoesUsuariosLgpd fromVO(DynamicVO vo) {
        this.codCla = vo.asBigDecimal("CODCLA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.tipoVisu = vo.asString("TIPOVISU");
        return this;
   }
}
