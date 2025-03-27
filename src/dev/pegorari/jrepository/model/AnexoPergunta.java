package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AnexoPergunta extends AbstractSankhyaEntity<AnexoPergunta> {
   public BigDecimal getCodPerg() {
        return this.getVo().asBigDecimal("CODPERG");
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
   }

   public byte[] getConteudo() {
        return this.getVo().asBlob("CONTEUDO");
   }

   public void setConteudo(byte[] conteudo) {
        markAsChanged("CONTEUDO", conteudo);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getNomeArquivo() {
        return this.getVo().asString("NOMEARQUIVO");
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
   }

   public BigDecimal getNuPesq() {
        return this.getVo().asBigDecimal("NUPESQ");
   }

   public void setNuPesq(BigDecimal nuPesq) {
        markAsChanged("NUPESQ", nuPesq);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TPQANE";
   }

   @Override
   public String getEntityName() {
        return "AnexoPergunta";
   }

   @Override
   public AnexoPergunta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
