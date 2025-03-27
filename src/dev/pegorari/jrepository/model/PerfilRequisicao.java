package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PerfilRequisicao extends AbstractSankhyaEntity<PerfilRequisicao> {
   public BigDecimal getCodPerfil() {
        return this.getVo().asBigDecimal("CODPERFIL");
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        markAsChanged("CODPERFIL", codPerfil);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getImprescindivel() {
        return this.getVo().asString("IMPRESCINDIVEL");
   }

   public void setImprescindivel(String imprescindivel) {
        markAsChanged("IMPRESCINDIVEL", imprescindivel);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public BigDecimal getPeso() {
        return this.getVo().asBigDecimal("PESO");
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
   }

   @Override
   public String getTableName() {
        return "TRSPER";
   }

   @Override
   public String getEntityName() {
        return "PerfilRequisicao";
   }

   @Override
   public PerfilRequisicao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
